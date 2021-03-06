import { Component, OnInit } from '@angular/core';
import {TrackService} from '../../track/track.service';
import {Track} from '../../track/track';
import {Observable} from "rxjs";
import {map} from "rxjs/operators";

@Component({
  selector: 'app-track-list',
  templateUrl: './track-list.component.html',
  styleUrls: ['./track-list.component.css']
})
export class TrackListComponent implements OnInit {

  public listOfTracks$: Observable<Track[]>;
  public name:string;

  constructor(private trackService: TrackService) { }

  // public addTrack():void{

  //   this.trackService.addTrack(track);
  // }

  ngOnInit() {
    this.listOfTracks$ = this.trackService.findAll();
  }

}
