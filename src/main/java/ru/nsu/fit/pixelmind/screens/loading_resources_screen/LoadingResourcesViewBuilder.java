package ru.nsu.fit.pixelmind.screens.loading_resources_screen;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.util.Builder;

public class LoadingResourcesViewBuilder implements Builder<Region> {


    public LoadingResourcesViewBuilder() {
    }

    @Override
    public Region build() {
        Label label = new Label("Loading Game...");
        VBox results = new VBox(20, label);
        results.setPadding(new Insets(40));
        results.setAlignment(Pos.CENTER);
        return results;
    }
}
