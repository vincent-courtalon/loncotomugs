export class Image{

    constructor(
        public id: number,
        public nom: string,
        public hauteur: number,
        public largeur: number,
        public taille: number,
        public contentType: string,
        public donnee:any
    ){}
}