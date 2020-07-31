package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.AjaxController.LongProcess;

/**
 * Servlet implementation class AjaxController
 */
@WebServlet("/AjaxController")
public class AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjaxController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);


		//System.out.println("POST request!!");
		LongProcess longProcess = new LongProcess();//threrad
		longProcess.setDaemon(true);
        longProcess.start();
        
        request.getSession().setAttribute("longProcess", longProcess);
        request.getRequestDispatcher("index.jsp").forward(request, response);
		
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		if(action.equals("one_click")) {
			
		}
	}
	  class LongProcess extends Thread {

          public void run() {
              System.out.println("Thread Started!!");
              int progress = 0;
			while (progress  < 10) {             
                  try { sleep(2000);
                  System.out.println("¾È³ç!!");
                  } catch (InterruptedException ignore) {}
                  progress++;
              }
          }           
      }

}
