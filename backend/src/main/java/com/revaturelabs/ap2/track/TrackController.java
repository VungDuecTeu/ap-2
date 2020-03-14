package com.revaturelabs.ap2.track;

import com.revaturelabs.ap2.track.dto.TrackDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/track")
@CrossOrigin()
public class TrackController {
  private TrackService trackService;

  public TrackController(TrackService trackService) {
    this.trackService = trackService;
  }

  @GetMapping
  public ResponseEntity<List<TrackDTO>> getAllTracks() {
    return this.trackService.findAll()
        .map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
  }

  @PostMapping
  public ResponseEntity<TrackDTO> createTrack(@RequestBody TrackDTO trackDTO) {
	  System.out.println(trackDTO);
    return this.trackService.save(trackDTO)
        .map(dto -> ResponseEntity.created(URI.create("/track/" + dto.getId())).body(dto))
        .orElseGet(() -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
  }

}
