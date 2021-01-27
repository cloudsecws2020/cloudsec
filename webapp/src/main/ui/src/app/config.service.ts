import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ConfigService {

  private readonly _apiURL: string = environment.apiURL;

  constructor(private _http: HttpClient) {
   }

  public httpCreate<Type>(url: string, data: unknown): Observable<Type> {
    return this._http.post<Type>(this._apiURL + url, data);
  }

  public httpRead<Type>(url: string, id: number): Observable<Type> {
    return this._http.get<Type>(this._apiURL + url + `${id}`);
  }

  public httpReadAll<Type>(url: string): Observable<Type> {
    return this._http.get<Type>(this._apiURL + url);
  }

  public httpUpdate<Type>(url: string, id: number, data: unknown): Observable<Type> {
    return this._http.put<Type>(this._apiURL + url + `${id}`, data);
  }

  public httpDelete<Type>(url: string, id: number) {
    return this._http.delete<Type>(this._apiURL + url + `${id}`);
  }

}
