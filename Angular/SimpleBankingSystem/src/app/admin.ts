export class Admin {
     id?:any;
	adminUsername?:any; 
     password?:any; 
     email?:any; 
     dob?:any; 
     address?:any;
     gender?:any; 
     phone?:any;
     img?:any;

     constructor(id?:any, adminUsername?:any, password?:any, email?:any, dob?:any, address?:any, gender?:any, phone?:any, img?:any){
            this.id=id;
            this.adminUsername=adminUsername;
            this.password=password;
            this.email=email;
            this.dob=dob;
            this.address=address;
            this.gender=gender;
            this.phone=phone;
            this.img=img;
     }
}
