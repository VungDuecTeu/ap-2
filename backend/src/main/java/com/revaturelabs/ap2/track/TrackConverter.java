package com.revaturelabs.ap2.track;

import com.revaturelabs.ap2.track.dto.TrackDTO;

public class TrackConverter {
  private TrackConverter() {}
  
  //backend
  public static TrackDTO convert(Track track) {
    return new TrackDTO(track.getId(), track.getName());
  }
  
  //frontend
  public static Track convert(TrackDTO trackDTO) {
    return new Track(trackDTO.getId(), trackDTO.getName());
  }
}
