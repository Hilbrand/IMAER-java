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
package nl.overheid.aerius.gml.v5_0.metadata;

import javax.xml.bind.annotation.XmlElement;

import nl.overheid.aerius.gml.base.AbstractProperty;
import nl.overheid.aerius.gml.v5_0.base.CalculatorSchema;

/**
 *
 */
public class ProjectMetadataProperty extends AbstractProperty<ProjectMetadata> {

  /**
   * Default constructor, needed for JAXB.
   */
  public ProjectMetadataProperty() {
    super(null);
  }

  /**
   * Convenience constructor.
   * @param property The property to use.
   */
  public ProjectMetadataProperty(final ProjectMetadata property) {
    super(property);
  }

  @Override
  @XmlElement(name = "ProjectMetadata", namespace = CalculatorSchema.NAMESPACE)
  public ProjectMetadata getProperty() {
    return super.getProperty();
  }

  @Override
  public void setProperty(final ProjectMetadata property) {
    super.setProperty(property);
  }

}
