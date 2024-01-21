import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent {

  // Schemas
  
  name     : String = "";
  username : String = "";
  email    : String = "";
  country  : String = "";
  mobileNo   : String = "";
  position : String = "";

  //Constructor to send or receive api request
  constructor (private http : HttpClient)
  {

  }

  //when user click the submit button then automaticallyy call this function...
  register()
  {
    //Asian the values to the particular variable..
    let bodydata ={

    "name"     : this.name,
    "username" : this.username,
    "email"    : this.email,
    "country"  : this.country,
    "mobileNo" : this.mobileNo,
    "position" : this.position

    }

    //Post the data's in a particular backend url...
    this.http.post("http://localhost:8089/api/v1/praju/save",bodydata,{responseType : "text"}).subscribe((resultdata : any)=>{

        //Confirm data inserted process
        console.log(resultdata);
        alert("DATA SUCCESSFULLY INSERTED..");

        //Once insert successfuly into the database then clear the UI form details..
        this.name     = "",
        this.username = "",
        this.email    = "",
        this.country  = "",
        this.mobileNo   = "",
        this.position = ""
    })
  }

  save(){
    this.register();
  }
  
}
