import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class PatientService{
   private getAllDoctorsApi='http://localhost:8085/api/doctor/all'
constructor(private httpClient : HttpClient){}
getAllDoctors():Observable<any>{
    return this.httpClient.get(this.getAllDoctorsApi)
}
}