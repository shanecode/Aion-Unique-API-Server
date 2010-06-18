/*
 * This file is part of aion-unique <aion-unique.org>.
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
package com.aionemu.gameserver.services;

import com.aionemu.gameserver.spawnengine.SpawnEngine;
import com.google.inject.Inject;

/**
 * This service is used in object controllers as injecting all services one by one is overhead.
 * 
 * @author ATracer
 * 
 */
public class ServiceProxy
{
	@Inject
	private DropService				dropService;
	@Inject
	private ExchangeService			exchangeService;
	@Inject
	private LegionService			legionService;
	@Inject
	private PrivateStoreService		privateStoreService;
	@Inject
	private RespawnService			respawnService;
	@Inject
	private TeleportService			teleportService;
	@Inject
	private TradeService			tradeService;
	@Inject
	private CubeExpandService		cubeExpandService;
	@Inject
	private SkillLearnService		skillLearnService;
	@Inject
	private GroupService			groupService;
	@Inject
	private CraftService			craftService;
	@Inject
	private CraftSkillUpdateService	craftSkillUpdateService;
	@Inject
	private WarehouseService		warehouseService;
	@Inject
	private PlayerService			playerService;
	@Inject
	private BrokerService			brokerService;
	@Inject
	private SpawnEngine				spawnEngine;
	@Inject
	private EnchantService			enchantService;
	@Inject
	private KiskService				kiskService;

	/**
	 * @return the dropService
	 */
	public DropService getDropService()
	{
		return dropService;
	}

	/**
	 * @return the exchangeService
	 */
	public ExchangeService getExchangeService()
	{
		return exchangeService;
	}

	/**
	 * @return the legionService
	 */
	public LegionService getLegionService()
	{
		return legionService;
	}

	/**
	 * @return the privateStoreService
	 */
	public PrivateStoreService getPrivateStoreService()
	{
		return privateStoreService;
	}

	/**
	 * @return the respawnService
	 */
	public RespawnService getRespawnService()
	{
		return respawnService;
	}

	/**
	 * @return the teleportService
	 */
	public TeleportService getTeleportService()
	{
		return teleportService;
	}

	/**
	 * @return the tradeService
	 */
	public TradeService getTradeService()
	{
		return tradeService;
	}

	/**
	 * @return the cubeExpandService
	 */
	public CubeExpandService getCubeExpandService()
	{
		return cubeExpandService;
	}

	/**
	 * @return the skillLearnService
	 */
	public SkillLearnService getSkillLearnService()
	{
		return skillLearnService;
	}

	/**
	 * @return groupService
	 */
	public GroupService getGroupService()
	{
		return groupService;
	}

	/**
	 * 
	 * @return craftService
	 */
	public CraftService getCraftService()
	{
		return craftService;
	}

	/**
	 * @return the craftSkillUpdateService
	 */
	public CraftSkillUpdateService getCraftSkillUpdateService()
	{
		return craftSkillUpdateService;
	}

	/**
	 * @return warehouseService
	 */
	public WarehouseService getWarehouseService()
	{
		return warehouseService;
	}

	/**
	 * @return the playerService
	 */
	public PlayerService getPlayerService()
	{
		return playerService;
	}
	
	public BrokerService getBrokerService()
	{
		return brokerService;
	}

	/**
	 * @return the spawnEngine
	 */
	public SpawnEngine getSpawnEngine()
	{
		return spawnEngine;
	}

	/**
	 * @return the enchantService
	 */
	public EnchantService getEnchantService()
	{
		return enchantService;
	}
	
	/**
	 * @return the kiskService
	 */
	public KiskService getKiskService()
	{
		return kiskService;
	}
}
