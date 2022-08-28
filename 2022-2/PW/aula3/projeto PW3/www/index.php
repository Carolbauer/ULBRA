        <?php
        ini_set('display_errors',1);
        ini_set('display_startup_errors',1);
        error_reporting(E_ALL);

        if (!isset($_GET['controller'])) {
          require_once('controllers/SiteController.php');
          $SiteController = new SiteController();
          $SiteController ->home();
        }else{
          switch($_REQUEST['controller']){
            case'site':
              require_once('controllers/SiteController.php');
              $SiteController = new SiteController();
              if(!isset($_GET['action'])){
                $SiteController -> home();
              }else{
                switch($_REQUEST['action']){
                  case'home':
                    $SiteController -> home();
                  break;
                  case'about':
                    $SiteController -> about();
                  break;
                  case 'produtos':
                    $SiteController -> produtos();
                  break;
                  case 'contact':
                    $SiteController -> contact();
                  break;
                }
              }
                  case 'client':
                    require_once('controllers/ClientController.php');
                    $client = new ClientController();
                    if(!isset($_GET['action'])){
                      $client -> index();
                }else{
                  switch($_REQUEST['action']){
                    case'register':
                      $client -> register();
                    break;
                    case 'registerView':
                      $client -> registerView();
                    break;

                }
              }
            break;
          }
        }

            
            

    
