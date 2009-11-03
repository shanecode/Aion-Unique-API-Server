/*
 * This file is part of aion-unique <aion-unique.com>.
 *
 *  aion-unique is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  aion-unique is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with aion-unique.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.gameserver.skillengine.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author ATracer
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "skill")
public class SkillLearnTemplate
{
	//TODO enums instead of strings
	
	@XmlAttribute(name = "classId", required = true)
	private String classId;
	@XmlAttribute(name = "skillId", required = true)
	private int skillId;
	@XmlAttribute(name = "skillLevel", required = true)
	private int skillLevel;
	@XmlAttribute(name = "name", required = true)
	private String name;
	@XmlAttribute(name = "type", required = true)
	private String type;
	@XmlAttribute(name = "race", required = true)
	private String race;
	@XmlAttribute(name = "minLevel", required = true)
	private int minLevel;
	
	/**
	 * @return the classId
	 */
	public String getClassId()
	{
		return classId;
	}
	/**
	 * @return the skillId
	 */
	public int getSkillId()
	{
		return skillId;
	}
	/**
	 * @return the skillLevel
	 */
	public int getSkillLevel()
	{
		return skillLevel;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}
	/**
	 * @return the minLevel
	 */
	public int getMinLevel()
	{
		return minLevel;
	}
	/**
	 * @return the race
	 */
	public String getRace()
	{
		return race;
	}
}