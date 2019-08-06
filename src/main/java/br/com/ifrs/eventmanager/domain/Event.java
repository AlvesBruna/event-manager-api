package br.com.ifrs.eventmanager.domain;

import java.io.Serializable;

import java.util.List;

import javax.validation.constraints.NotNull;

public class Event implements Serializable {
  private static final long serialVersionUID = -2446647193332018482L;
  @NotNull private int id;
  @NotNull private String name;
  @NotNull private String venue;
  @NotNull private List<String> guests;

  public Event(int id, String name, String venue, List<String> guests) {
    this.id = id;
    this.name = name;
    this.venue = venue;
    this.guests = guests;
  }

  public void setGuests(List<String> guests) {
    this.guests = guests;
  }

  public int getId(){
    return id;
  }

  public void setId(int id){
    this.id = id;
  }

  public List<String> getGuests() {
    return guests;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }
}
