package br.com.ifrs.eventmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.ifrs.eventmanager.domain.Event;

@Repository
public class EventRepository {
  private List<Event> events;

  public EventRepository() {
    this.events = new ArrayList<>();
  }

  public Event insert(Event event) {
    event.setId(events.size());
    events.add(event);

    return event;
  }

  public List<Event> findAll() {
    return events;
  }

  public boolean delete(String id) {
    Event event = events.stream()
      .filter(e -> e.getId() == Integer.parseInt(id))
      .findAny()
      .orElse(null);
      
    if(event == null) {
      return false;
    }

    events.remove(event);

    return true;
  }
}
