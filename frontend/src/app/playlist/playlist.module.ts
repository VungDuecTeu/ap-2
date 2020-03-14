import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {PlaylistRoutingModule} from './playlist-routing.module';
import {TrackListComponent} from './track-list-page/track-list.component';
import {TrackModule} from '../track/track.module';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    TrackListComponent
  ],
  exports: [
    TrackListComponent
  ],
  imports: [
    CommonModule,
    PlaylistRoutingModule,
    TrackModule,
    FormsModule
  ]
})
export class PlaylistModule { }
