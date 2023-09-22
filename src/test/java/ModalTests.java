import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


@Owner("Alex156qa")
@Feature("Модалка создания/редактирования маршрута (верстка)")
public class ModalTests {

    @Test
    @Story("Поиск")
    @DisplayName("Поиск города и ПВЗ")
    public void searchCityTest() {
        step("Проверить поиск города и ПВЗ", () -> {
        });

        step("Проверка отображения ПВЗ при нажатии на город в правой части блока", () -> {
        });
    }
    @Test
    @Story("Чек-бокс")
    @DisplayName("Чек-бокс внешний вид")
    public void formChekboxTest() {
        step("Проверить цвет и активное состояние чекбокса", () -> {
        });

        step("Проверка чек-бокса города, ПВЗ которого выбраны частично", () -> {
        });

        step("Проверка чек-бокс города, все ПВЗ которого выбраны не все", () -> {
        });
    }

    @Test
    @Story("Чек-бокс")
    @DisplayName("Работа чек-бокса")
    public void actionsChekboxTest() {
        step("Проверка работы при нажатии на чек-бокс с белой полоской", () -> {
        });

        step("Проверка работы при нажатии на чек-бокс с белой галочкой", () -> {
        });

        step("Проверка работы при нажатии на полностью белый чек-бокс", () -> {
        });

        step("Проверка работы при нажатии на неактивный чек-бокс города или ПВЗ", () -> {
        });
    }

    @Test
    @Story("Модалка")
    @DisplayName("Работа элементов модалки")
    public void actionsModalWindowTest() {
        step("Проверка работы при нажатии на знак вопроса в блоке с ПВЗ", () -> {
        });

        step("Проверка выведения цифр - номеров маршрутов блоке с ПВЗ", () -> {
        });

        step("Проверка предупреждения при нажатии на область вне модалки или на крестик", () -> {
        });

        step("Проверка кнопки Сохранить", () -> {
        });
    }

    }
