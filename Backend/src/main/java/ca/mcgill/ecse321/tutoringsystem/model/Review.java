package ca.mcgill.ecse321.tutoringsystem.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Review {
  private Tutor tutor;

  @ManyToOne(optional = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  public Tutor getTutor() {
    return this.tutor;
  }

  public void setTutor(Tutor tutor) {
    this.tutor = tutor;
  }

  private Student student;

  @ManyToOne(optional = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  public Student getStudent() {
    return this.student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  private Integer rating;

  public void setRating(Integer value) {
    this.rating = value;
  }

  public Integer getRating() {
    return this.rating;
  }

  private String comment;

  public void setComment(String value) {
    this.comment = value;
  }

  public String getComment() {
    return this.comment;
  }

  private Person from;

  public void setFrom(Person value) {
    this.from = value;
  }

  @ManyToOne(optional = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  public Person getFrom() {
    return this.from;
  }

  private Person to;

  public void setTo(Person value) {
    this.to = value;
  }

  @ManyToOne(optional = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  public Person getTo() {
    return this.to;
  }

  private Integer reviewId;

  public void setReviewId(Integer value) {
    this.reviewId = value;
  }

  @Id
  @GeneratedValue()
  public Integer getReviewId() {
    return this.reviewId;
  }
}
