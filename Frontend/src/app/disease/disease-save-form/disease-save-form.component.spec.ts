import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DiseaseSaveFormComponent } from './disease-save-form.component';

describe('DiseaseSaveFormComponent', () => {
  let component: DiseaseSaveFormComponent;
  let fixture: ComponentFixture<DiseaseSaveFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DiseaseSaveFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DiseaseSaveFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
