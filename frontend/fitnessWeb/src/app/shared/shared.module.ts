import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DemoNgZorroAntdModule } from '../demo-ng-zorro-antd.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterLink, RouterOutlet } from '@angular/router';



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    DemoNgZorroAntdModule,
    ReactiveFormsModule,
    FormsModule,
    RouterLink,
    RouterOutlet,
  ],
  exports: [
    CommonModule,
    DemoNgZorroAntdModule,
    ReactiveFormsModule,
    FormsModule,
    RouterLink,
    RouterOutlet,
  ]
})
export class SharedModule { }
