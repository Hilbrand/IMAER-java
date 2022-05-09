/*
 * Copyright the State of the Netherlands
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package nl.overheid.aerius.shared.domain.geo;

/**
 * Enum of relevant EPSG constants.
 */
public enum EPSG {
  /**
   * British National Grid -- United Kingdom (EPSG:27700).
   */
  BNG(27700),
  /**
   * RD New coordinates (EPSG:28992).
   */
  RDNEW(28992),
  /**
   * WGS84 (EPSG::4326)
   */
  WGS84(4326);

  private static final String EPSG_PRE_TEXT = "EPSG:";

  private int srid;

  EPSG(final int srid) {
    this.srid = srid;
  }

  public static EPSG safeValueOf(final String srid) {
    try {
      return srid == null ? null : valueOf(srid);
    } catch (final IllegalArgumentException e) {
      return null;
    }
  }

  public int getSrid() {
    return srid;
  }

  public String getEpsgCode() {
    return EPSG_PRE_TEXT + srid;
  }
}
