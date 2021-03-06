/*
PORPHYRY - Digital space for building and confronting interpretations about
documents

SCIENTIFIC COMMITTEE
- Andrea Iacovella
- Aurelien Benel

OFFICIAL WEB SITE
http://www.porphyry.org/

Copyright (C) 2006 Aurelien Benel.

LEGAL ISSUES
This program is free software; you can redistribute it and/or modify it under
the terms of the GNU General Public License (version 2) as published by the
Free Software Foundation.
This program is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
PARTICULAR PURPOSE. See the GNU General Public License for more details:
http://www.gnu.org/licenses/gpl.html
*/

package org.porphyry.view;

import java.awt.*;

public class EquilateralTriangle extends Polygon {

// TODO Could be optimized by getting approximated values for sinus and cosinus 
public EquilateralTriangle(int centerX, int centerY, int radius, double pitch) {
	super();
	for (int i=0; i<3; i++) {
		double angle = pitch + 2*i*Math.PI/3;
		this.addPoint(
			(int) (centerX + Math.round(radius*Math.cos(angle))),
			(int) (centerY + Math.round(radius*Math.sin(angle)))
		);
	}
}

}
