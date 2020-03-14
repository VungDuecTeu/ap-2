package com.revaturelabs.ap2.track.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackDTO { // fields that are in our frontend
  private int id;
  private String name;
}
