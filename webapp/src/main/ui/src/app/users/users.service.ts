import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ConfigService } from '../config.service';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UsersService {
  private _url: string = "user/";

  constructor(private readonly _configService: ConfigService) {

  }

  public create(data: User): Observable<Object> {
    return this._configService.httpCreate<Object>(this._url + 'create/' , data);
  }

  public read(id: number): Observable<User> {
    return this._configService.httpRead<User>(this._url + 'read/', id);
  }

  public readAll(): Observable<User[]> {
    return this._configService.httpReadAll<User[]>(this._url);
  }

  public update(id: number, data: User): Observable<User> {
    return this._configService.httpUpdate<User>(this._url + 'update/', id, data);
  }

  public delete(id: number): Observable<User> {
    return this._configService.httpDelete<User>(this._url + 'delete/', id);
  }



  
}
