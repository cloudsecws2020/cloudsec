import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { User } from './user';
import { UsersService } from './users.service';


@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss']
})
export class UsersComponent implements OnInit {

  private readonly _userService: UsersService;
  _userForm: FormGroup;
  private _users: User[] = [];
  private _userCount: number = 0;
  private id: number = 0;

  constructor(userService: UsersService) {
    this._userService = userService;
   }

  ngOnInit(): void {
    this.initForm();
  }

  public initForm() {
    this._userForm = new FormGroup({
      firstName: new FormControl('', Validators.nullValidator && Validators.required),
      lastName: new FormControl('', Validators.nullValidator && Validators.required),
      email: new FormControl('', Validators.nullValidator && Validators.required)
    });
  }

  public create() {
    var user: User = new User();
    user.id =this.id;
    user.firstName = this._userForm.controls.firstName.value;
    user.lastName = this._userForm.controls.lastName.value;
    user.email = this._userForm.controls.email.value;
    this.id += 1;
    return this._userService.create(user).subscribe(u => {
      console.log("User " + user.lastName + " created!");
      this._userForm.reset();
    })
  }

  public read(id: number) {
    return this._userService.read(id).subscribe(u => {
      console.log("Read User " + u.lastName);
    })
  }

  public readAll() {
    return this._userService.readAll().subscribe(u => {
      console.log("Read all users: ");
      u.forEach(us => console.log(us.lastName));
    })
  }

  public update(id: number) {
    var user: User = new User();
    user.id = 0;
    user.firstName = this._userForm.controls.firstName.value;
    user.lastName = this._userForm.controls.lastName.value;
    user.email = this._userForm.controls.email.value;
    return this._userService.update(id, user).subscribe(u => {
      u.firstName = user.firstName;
      u.lastName = user.lastName;
      u.email = user.email;
      console.log("User updated!");
    });
  }

  public delete(id: number) {
    return this._userService.delete(id).subscribe(u => {
      console.log("User deleted!");
    })
  }
}
