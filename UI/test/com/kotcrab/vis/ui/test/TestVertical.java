/*
 * Copyright 2014-2015 Pawel Pastuszak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.ui.test;

import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.kotcrab.vis.ui.TableUtils;
import com.kotcrab.vis.ui.VisTable;
import com.kotcrab.vis.ui.VisUI;
import com.kotcrab.vis.ui.widget.VisProgressBar;
import com.kotcrab.vis.ui.widget.VisSlider;
import com.kotcrab.vis.ui.widget.VisWindow;

public class TestVertical extends VisWindow {

	public TestVertical (boolean useVisComponets) {
		super("vertical");

		TableUtils.setSpaceDefaults(this);
		columnDefaults(0).left();

		if (useVisComponets)
			addVisComponents();
		else
			addNormalComponents();

		setSize(100, 200);
		setPosition(1100, 90);
	}

	private void addNormalComponents () {
		ProgressBar progressbar = new ProgressBar(0, 100, 1, true, VisUI.skin);
		Slider slider = new Slider(0, 100, 1, true, VisUI.skin);
		Slider sliderDisabled = new Slider(0, 100, 1, true, VisUI.skin);

		progressbar.setValue(50);
		slider.setValue(50);
		sliderDisabled.setValue(50);
		sliderDisabled.setDisabled(true);

		VisTable progressbarTable = new VisTable(true);
		progressbarTable.add(progressbar);
		progressbarTable.add(slider);
		progressbarTable.add(sliderDisabled);

		add(progressbarTable);
	}

	private void addVisComponents () {
		VisProgressBar progressbar = new VisProgressBar(0, 100, 1, true);
		VisSlider slider = new VisSlider(0, 100, 1, true);
		VisSlider sliderDisabled = new VisSlider(0, 100, 1, true);

		progressbar.setValue(50);
		slider.setValue(50);
		sliderDisabled.setValue(50);
		sliderDisabled.setDisabled(true);

		VisTable progressbarTable = new VisTable(true);
		progressbarTable.add(progressbar);
		progressbarTable.add(slider);
		progressbarTable.add(sliderDisabled);

		add(progressbarTable);
	}
}