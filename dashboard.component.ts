import { NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { PatientService } from '../../services/patient.service';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [NgFor],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent {
  myDoctors :any[]=[];
  constructor(private patientService:PatientService){
    this.patientService.getAllDoctors()
    .subscribe({
      next:(data)=>{
        this.myDoctors = data;
      },
      error: ()=>{}
    })
    
      // this.myDoctors =[{
      //   doctorName:'Dr Ajeet',
      //   availableDate:'02-12-2024'
      // },{
      //   doctorName:'Dr Deepak',
      //   availableDate:'03-12-2024'
      // }
        
        
      // ]
    

  }

}


