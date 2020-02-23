import { Disease } from './disease.domain';

export class Drug {
    drugId:string;
    drugSerialNo:string;
    drugName:string;
    drugProspectus:string;
    disease:Disease;

    constructor(){
        this.drugId=null;
        this.drugSerialNo=null;
        this.drugName=null;
        this.drugProspectus=null;
        this.disease=null;
    }
}
