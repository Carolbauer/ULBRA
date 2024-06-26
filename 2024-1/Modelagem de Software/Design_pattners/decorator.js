//component interface
class uploadFile {
    constructor(file){
        this.file = file;
    }
    upload(){
        return this.file;
    }
}

//concrete component
class LocalStorage extends uploadFile{
    upload(){
        const file = super.upload();
        console.log(`Uploaded ${file} to LocalStorage.`);
        return file;
    }
}



