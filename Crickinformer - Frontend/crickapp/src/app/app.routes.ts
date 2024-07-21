import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { HistoryComponent } from './pages/history/history.component';
import { PointTableComponent } from './pages/point-table/point-table.component';
import { LiveComponent } from './pages/live/live.component';

export const routes: Routes = [
    {
        path: 'home',
        component: HomeComponent,
        title: 'Home Page'
    },
    {
        path: 'history',
        component: HistoryComponent,
        title: 'History'
    },
    {
        path: 'live',
        component: LiveComponent,
        title: 'Live'
    },
    {
        path: 'point-table',
        component: PointTableComponent,
        title: 'Point Table'
    }
];
