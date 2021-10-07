package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("test")
    void generatedTest() {
        step("Lorem ipsum dolor", () -> {
            step("// todo: just add selenium action");
        });

        step("It amet consectetur adipisicing elit", () -> {
            step("// todo: just add selenium action");
        });

        step("Debitis dolorem natus nemo", () -> {
            step("// todo: just add selenium action");
        });

        step("Ducimus, autem saepe!", () -> {
            step("// todo: just add selenium action");
        });
    }
}