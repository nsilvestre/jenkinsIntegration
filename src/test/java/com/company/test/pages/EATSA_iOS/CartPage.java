package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CartPage extends MobileBasePO {

    String itemPredicate;
    private String nameID = "Add a name or";
    private String collectionViewClass = "XCUIElementTypeCollectionView";
    private String cellClass = "XCUIElementTypeCell";

    public CartPage(AppiumDriver driver) {
        super(driver);
    }


    /**
    Returns the amount of cells (items) in the collection (item list)
    **/
    public long itemsInCart(String item) {
        WebElement itemList;
        List<WebElement> itemsInCart;

        itemList = getWaitDriver().until(ExpectedConditions.presenceOfElementLocated(By.className(collectionViewClass)));
        itemsInCart = itemList.findElements(By.className(cellClass));

        return itemsInCart.size();
    }


    public void selectCheckOutType(String checkOutType) {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(checkOutType))).click();
    }


    /**
     Select the first item on a collection view
     **/
    public void selectFirstItem() {
        WebElement itemList;
        List<WebElement> itemsInCart;
        IOSElement firstItem;

        //select the cell (item) in the collection (item list)
        itemList = getWaitDriver().until(ExpectedConditions.presenceOfElementLocated(By.className(collectionViewClass)));
        itemsInCart = itemList.findElements(By.className(cellClass));
        firstItem = (IOSElement) itemsInCart.get(0);
        firstItem.click();
    }


    /**
     Returns the amount of cells (items) in the collection (item list)
     **/
    public int itemsInCartCount() {
        WebElement itemList;
        List<WebElement> itemsInCart;

        //select the cell (item) in the collection (item list)
        itemList = getWaitDriver().until(ExpectedConditions.presenceOfElementLocated(By.className(collectionViewClass)));
        itemsInCart = itemList.findElements(By.className(cellClass));

        return itemsInCart.size();
    }


    public void tapNameOrSpecialRequest() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(nameID))).click();
    }
}
