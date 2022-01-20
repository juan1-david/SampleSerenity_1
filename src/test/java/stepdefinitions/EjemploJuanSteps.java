package stepdefinitions;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.HomePage;

import java.util.List;

public class EjemploJuanSteps {


    @Managed(driver = "chrome")

    private WebDriver navegador;
    private Actor actor = Actor.named("Juan");
    private HomePage homePage = new HomePage();


    @Dado("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedehastalawWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^el agregar un producto al carro$")
    public void elAgregarUnProductoAlCarro() {
    }

    @Entonces("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {
    }

    @Cuando("^el agregar un producto al carro$")
    public void elAgregarUnProductoAlCarro(List<String> datos) {
    }
}
