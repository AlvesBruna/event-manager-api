package br.com.ifrs.eventmanager.service;

import org.springframework.stereotype.Service;

import java.util.List;

import br.com.ifrs.eventmanager.domain.Event;
import br.com.ifrs.eventmanager.repository.EventRepository;

@Service
public class EventService {
  private final EventRepository repository;

  public EventService(EventRepository repository) {
    this.repository = repository;
  }

  public Event insert(Event event) {
    return repository.insert(event);
  }

  public List<Event> findAll() {
    return repository.findAll();
  }

  public boolean delete(String id) {
    return repository.delete(id);
  }
}
