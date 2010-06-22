/*
 * Copyright (c) 2010, William Bittle
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted 
 * provided that the following conditions are met:
 * 
 *   * Redistributions of source code must retain the above copyright notice, this list of conditions 
 *     and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright notice, this list of conditions 
 *     and the following disclaimer in the documentation and/or other materials provided with the 
 *     distribution.
 *   * Neither the name of dyn4j nor the names of its contributors may be used to endorse or 
 *     promote products derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR 
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND 
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL 
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER 
 * IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT 
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.dyn4j.game2d.dynamics.contact;

import org.dyn4j.game2d.dynamics.Body;
import org.dyn4j.game2d.dynamics.Fixture;
import org.dyn4j.game2d.geometry.Vector;

/**
 * Represents a sensed contact point.
 * <p>
 * A sensed contact point is a contact point that is not solved.
 * @author William Bittle
 */
public class SensedContactPoint extends ContactPoint {
	/**
	 * Full constructor.
	 * @param point the world space contact point
	 * @param normal the world space contact normal
	 * @param depth the penetration depth
	 * @param body1 the first {@link Body} in contact
	 * @param fixture1 the first {@link Body}'s {@link Fixture}
	 * @param body2 the second {@link Body} in contact
	 * @param fixture2 the second {@link Body}'s {@link Fixture}
	 */
	public SensedContactPoint(Vector point, Vector normal, double depth, Body body1, 
			Fixture fixture1, Body body2, Fixture fixture2) {
		this.point = point;
		this.normal = normal;
		this.depth = depth;
		this.body1 = body1;
		this.fixture1 = fixture1;
		this.body2 = body2;
		this.fixture2 = fixture2;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("SENSED_CONTACT_POINT[")
		.append(this.point).append("|")
		.append(this.normal).append("|")
		.append(this.depth).append("|")
		.append(this.body1).append("|")
		.append(this.body2).append("|")
		.append(this.fixture1).append("|")
		.append(this.fixture2).append("]");
		return sb.toString();
	}
}
