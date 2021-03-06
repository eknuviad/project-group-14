package ca.mcgill.ecse321.tutoringsystem.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.sql.Time;
import java.util.Set;
import java.sql.Date;
import javax.persistence.CascadeType;

@Entity
public class Request {
	private Tutor tutor;

	@ManyToOne(optional = false)
	public Tutor getTutor() {
		return this.tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	private Integer requestId;

	public void setRequestId(Integer value) {
		this.requestId = value;
	}

	@Id
	@GeneratedValue()
	public Integer getRequestId() {
		return this.requestId;
	}

	private Student student;

	@ManyToOne(optional = false)
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	private Time time;

	public void setTime(Time value) {
		this.time = value;
	}

	public Time getTime() {
		return this.time;
	}

	private Date date;

	public void setDate(Date value) {
		this.date = value;
	}

	public Date getDate() {
		return this.date;
	}

	private Set<Notification> notification;

	@OneToMany(mappedBy = "request", cascade = { CascadeType.ALL })
	public Set<Notification> getNotification() {
		return this.notification;
	}

	public void setNotification(Set<Notification> notifications) {
		this.notification = notifications;
	}

	private Course course;

	@ManyToOne(optional = false)
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	private Room room;

	@ManyToOne
	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
