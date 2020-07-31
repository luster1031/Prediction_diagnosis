package ConnectDB;

public class put_data {
	private String part_name;
	private String factory_sug;
	private String ai_sug;
	private String actual_change;
	private int how_many;
	private String manual;
	private int PID;
	private float angle;
	private float speed;
	private java.sql.Timestamp time;
	


	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public float getAngle() {
		return angle;
	}
	public void setAngle(float angle) {
		this.angle = angle;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public java.sql.Timestamp getTime() {
		return time;
	}
	public void setTime(java.sql.Timestamp timestamp) {
		this.time = timestamp;
	}
	public String getPart_name() {
		return part_name;
	}
	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}
	public String getFactory_sug() {
		return factory_sug;
	}
	public void setFactory_sug(String factory_sug) {
		this.factory_sug = factory_sug;
	}
	public String getAi_sug() {
		return ai_sug;
	}
	public void setAi_sug(String ai_sug) {
		this.ai_sug = ai_sug;
	}
	public String getActual_change() {
		return actual_change;
	}
	public void setActual_change(String actual_change) {
		this.actual_change = actual_change;
	}
	public int getHow_many() {
		return how_many;
	}
	public void setHow_many(int how_many) {
		this.how_many = how_many;
	}
	public String getManual() {
		return manual;
	}
	public void setManual(String manual) {
		this.manual = manual;
	}
	public put_data() {
        // TODO Auto-generated constructor stub
    }
	public put_data(String part_name, String factory_sug,String ai_sug, String actual_change, int how_many, String manual) {
        super();
        this.part_name = part_name;
        this.factory_sug = factory_sug;
        this.ai_sug = ai_sug;
        this.actual_change = actual_change;
        this.how_many = how_many;
        this.manual = manual;
    }	
	
	public put_data(int PID, float angle,float speed, java.sql.Timestamp time) {
        super();
        this.PID = PID;
        this.angle = angle;
        this.speed = speed;
        this.time = time;
    }
	@Override
    public String toString() {
        return "part_list [part_name=" + part_name + ", factory_sug=" + factory_sug + ", ai_sug=" + ai_sug + ", actual_change=" + actual_change + ", how_many=" + how_many + ", manual="+ manual
                + "]";
    }
	
	public String toString_data() {
        return "all_data [part_name=" + part_name + ", factory_sug=" + factory_sug + ", ai_sug=" + ai_sug + ", actual_change=" + actual_change + ", how_many=" + how_many + ", manual="+ manual
                + "]";
    }
	

}
