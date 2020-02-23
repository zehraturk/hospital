import { Drug } from './drug.domain';
import { Doctor } from './doctor.domain';
import { Patient } from './patient.domain';

export class Treatment {
    treatmentId:string;
    drug:Drug;
    doctor:Doctor;
    patient:Patient;
    treatDate:string;
    
    constructor(){
        this.treatmentId=null;
        this.drug=null;
        this.doctor=null;
        this.patient=null;
        this.treatDate=null;
    }
}
