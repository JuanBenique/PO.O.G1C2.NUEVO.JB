package pe.edu.upeu.pe.edu.upeu.sysventas.controller;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Controller;
import pe.edu.upeu.pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.pe.edu.upeu.sysventas.model.Producto;
import pe.edu.upeu.pe.edu.upeu.sysventas.service.ICategoriaService;
import pe.edu.upeu.pe.edu.upeu.sysventas.service.IMarcaService;
import pe.edu.upeu.pe.edu.upeu.sysventas.service.IUnidadMedidaService;
import pe.edu.upeu.pe.edu.upeu.sysventas.service.ProductoIService;

@Controller
public class ProductoController {
    @FXML
    TextField txtNombreProducto, txtPUnit,
            txtPUnitOld, txtUtilidad, txtStock, txtStockOld,
            txtFiltroDato;
    @FXML
    ComboBox<ComboBoxOption> cbxMarca;
    @FXML
    ComboBox<ComboBoxOption> cbxCategoria;
    @FXML
    ComboBox<ComboBoxOption> cbxUnidMedida;
    @FXML
    private TableView<Producto> tableView;
    @FXML
    Label lbnMsg, idPrueba;
    @FXML
    private AnchorPane miContenedor;
    Stage stage;
    @Autowired
    IMarcaService ms;
    @Autowired
    ICategoriaService cs;
    @Autowired
    ProductoIService ps;
    @Autowired
    IUnidadMedidaService ums;
    private Validator validator;
    ObservableList<Producto> listarProducto;
    Producto formulario;
    Long idProductoCE=0L;

}