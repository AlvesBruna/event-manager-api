package br.com.ifrs.eventmanager.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifrs.eventmanager.domain.Event;
import br.com.ifrs.eventmanager.service.EventService;

@RestController
@RequestMapping("/events")
public class EventResource {
  private final EventService service;

  public EventResource(EventService service) {
    this.service = service;
  }

  @DeleteMapping("/")
  public ResponseEntity<Void> delete(@RequestParam String id) {
    if(service.delete(id)) {
      return ResponseEntity.ok().build();
    }

    return ResponseEntity.badRequest().build();
  }

  @PostMapping("/")
  public ResponseEntity<Event> insert(@RequestBody @Valid Event event) {
    return ResponseEntity.ok(service.insert(event));
  }

  @GetMapping("/")
  public ResponseEntity<List<Event>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }
}
