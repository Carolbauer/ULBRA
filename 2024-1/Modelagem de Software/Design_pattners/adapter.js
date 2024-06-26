//Adaptee (Implementação específica de upload de arquivos)

class LocalStorage {
    upload(file) {
      console.log(`Uploaded ${file} to LocalStorage.`);
    }
}

// Adaptee (Implementação específica de download de arquivos)

class drive {
    download(file) {
        console.log('Download ${file) to drive.');
    }
}

// Target interface (Interface esperada pelo cliente)
class fileAdapter{
    constructor(file){
        this.file = file;
    }
    upload(file){
        if(this.file.upload){
            this.file.upload(file);
        } else if(this.file.download){
            this.file.download(file);
        } else {
            throw new Error('Unsupported file method.');
        }
    }
}

// Uso do Adapter
const localStorage = new LocalStorage();
const drive = new drive();

const fileAdapter1 = new fileAdapter(localStorage);
fileAdapter1.upload('file.txt'); // Saída: Uploaded file.txt to LocalStorage.

const filwAdapter2 = new fileAdapter(drive);
fileAdapter2.upload('file.txt'); // Saída: Download file.txt to drive.