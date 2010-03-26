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
package com.aionemu.gameserver.world.zone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * @author ATracer
 *
 */
@XmlType(name = "ZoneName")
@XmlEnum
public enum ZoneName
{
	//Poeta
	DEFORESTED_AREA,
	WORG_RUN,
	DAMINU_FOREST,
	MELPONEHS_CAMPSITE,
	AGERS_FARM,
	AKARIOS_VILLAGE,
	TIMOLIA_MINE,
	KABARAH_STRIP_MINE,
	FEIRAS_DOCK,
	AKARIOS_PLAINS,
	KALESS_FARM,
	CLIONA_LAKE,
	NYMPHS_POND,
	AGARIC_SPORE_ROAD,
	ITEMUSE_Q1006,
	Q1123,
	//Ishalgen
	DUBARO_VINE_CANYON,
	ANTUROON_SENTRY_POST,
	SAP_FARM,
	ISHALGEN_PRISON_CAMP,
	ODELLA_PLANTATION,
	ALDELLE_HILL,
	MUNIHELE_FOREST,
	NEGIS_DOCK,
	THE_FORSAKEN_HOLLOW,
	ANTUROON_COAST,
	ISHALGEN_SENTRY_POST,
	LAKE_TUNAPRE,
	ALDELLE_VILLAGE,
	EYVINDR_ANCHORAGE,
	KARDS_CAMPSITE,
	ALDELLE_BASIN,
	GUHEITUNS_TENT,
	ANTUROON_CROSSING,
	DARU_SPRING,
	HATATAS_HIDEOUT,
	// sanctum
	COLISEUM,
	OUTER_DOCK,
	DIONYSIA_TAVERN,
	//COLISEUM, 2 coliseum maps
	LIBRARY_OF_THE_SAGES,
	SANCTUM_GATE,
	LYCEUM,
	HALL_OF_PROSPERITY,
	DIVINE_ROAD,
	PROTECTORS_HALL,
	AIRSHIP_DOCK,
	ELYOS_SQUARE,
	STR_SZ_LC1_SUB_H,
	ARTISANS_HALL,
	SKY_GARDEN,
	TEMPEST_SHIPYARD,
	SKY_CANAL,
	EXALTED_PATH,
	//verteron
	ZUMION_CANYON,
	VERTERON_CITADEL,
	CANTAS_COAST,
	GEOLUS_CAMPSITE,
	TURSIN_OUTPOST,
	TURSIN_TOTEM_POLE,
	KRAKAS_DEN,
	BELBUAS_FARM,
	ODIUM_REFINING_CAULDRON,
	TALUNS_NEST,
	ALTAMIA_RIDGE,
	TURSIN_OUTPOST_ENTRANCE,
	FRILLNECK_WOODS,
	PILGRIMS_RESPITE,
	ALTAR_OF_THE_CRIMSON_DRAGON,
	MIRAJUS_HOLY_GROUND,
	NORTHERN_TOLBAS_FOREST,
	ZUMION_RUINS,
	TOLBAS_VILLAGE,
	ARDUS_SHRINE,
	ROAD_TO_ELTNEN,
	DUKAKI_SETTLEMENT,
	CONTAMINATED_SWAMP,
	DUKAKI_MINE,
	ELLUN_RIVER_MOUTH,
	VERTERON_OBSERVATORY,
	MYSTERIOUS_SHIPWRECK,
	VERTERON_SWAMP,
	SOUTHERN_TOLBAS_FOREST,
	TURSIN_GARRISON,
	Q1012,
	//eltnen
	PUTRID_MIRE,
	DRAKE_HABITAT,
	ELTNEN_OBSERVATORY,
	ERACUS_TEMPLE_CAVERN,
	EASTERN_ERACUS_DESERT,
	MYSTIC_SPRING_OF_LAQUEPIN,
	KAIDAN_MINE,
	MABANGTAHS_HIDEOUT,
	PRELLUS_WASTELAND,
	REFUGEE_CAMP,
	KURIULLU_PASS,
	KYOLA_TEMPLE,
	MANDURI_VILLAGE,
	GEROCH_CALDERA,
	TIGRIC_VILLAGE,
	ELTNEN_FORTRESS,
	MYSTIC_SPRING_OF_ANATHE,
	SATALOCAS_TOMB,
	MANDURI_FOREST,
	MANDURI_STORES,
	ROAD_TO_HEIRON,
	LEPHARIST_CITADEL,
	RUBEREIN_WASTES,
	ERACUS_TEMPLE_CAVERN_ENTRANCE,
	LANKUSIS_PLATEAU,
	OUTPOST_RUINS,
	KURIULLU_MOUNTAIN_OUTPOST,
	WESTERN_ERACUS_DESERT,
	KLAW_NEST,
	GOLDEN_BOUGH_GARRISON,
	KYOLA_TEMPLE_ENTRANCE,
	KAIDAN_HEADQUARTERS,
	CALDERA_OUTPOST,
	DESERT_SCOUT_CAMP,
	ELTNEN_FORTRESS_ENTRANCE,
	AGAIRON_VILLAGE,
	MYSTIC_SPRING_OF_AGAIRON,
	KURIULLU_MOUNTAIN,
	ROAD_TO_VERTERON,
	EIRON_DESERT,
	KLAW_DEN,
	//heiron
	INDRATU_BARRACKS,
	MANOR_CEMETERY,
	NUTE_WARRENS,
	BERONES_RUINED_HOUSE,
	NEW_HEIRON_GATE,
	POISON_EXTRACTION_LAB,
	PRETOR_EXPERIMENT_LAB,
	KISHAR_VILLAGE,
	PATEMA_GEYSER,
	JEIAPARAN_VILLAGE,
	KISHAR_OBSERVATION_POST,
	STENON_BAY,
	TIGRIC_VILLAGE_HEIRON, // same name eltnen
	DRAGONS_BLOOD_CANYON,
	ORTON_FARM,
	DRAKE_FARM,
	CURSED_ANCIENT_TEMPLE,
	PATEMA_RUINS,
	LEPHARIST_RESEARCH_CENTER,
	PUITONEN_BOGS,
	RESEARCH_CENTER_OVERWATCH,
	HEIRON_PASS,
	KLAWTANS_WALLOW,
	GLOOMY_MIRE,
	ISLAND_OF_ETERNITY,
	CONTESTED_EXPANSE,
	MEDEUS_ALTAR,
	BLACK_TEARS_SWAMP,
	DEATHSONG_FOREST,
	VAIZELS_PEAK,
	DESTROYED_GUARD_TOWER,
	ROTRON_EXPERIMENT_LAB,
	ARBOLUS_HAVEN,
	MEDEUS_MANOR_WEST,
	MEDEUS_MANOR_EAST,
	ROAD_TO_ELTNEN_HEIRON, // same name eltnen
	NOLANTIS_RUINS,
	MANDURI_VALLEY,
	THE_STORM_CIRCLE,
	KAKUNAS_NEST,
	CHANGARNERKS_CAMPSITE,
	MUDTHORN_EXPERIMENT_LAB,
	DECAYED_GROVE,
	RUINED_DRAKE_TEMPLE,
	POYA_JUNGLE,
	HEIRONOPOLIS,
	MONITOR_FARM,
	HEIRON_OBSERVATORY,
	KUNPAPA_OUTPOST,
	SENEAS_CAMPSITE,
	GRAY_FOG_MARSHES,
	
	//ALTGARD
	MAHINDEL_SWAMP_220030000,
	MANIRS_CAMPSITE_220030000,
	GERGER_VILLAGE_220030000,
	IDUNS_LAKE_220030000,
	ALTGARD_FORTRESS_DUNGEON_220030000,
	ALTGARD_OBSERVATORY_220030000,
	GRAVE_ROBBERS_DEN_220030000,
	ALTGARD_ICE_LAKE_220030000,
	MUMU_FARMLAND_220030000,
	GRIBADE_CANYON_220030000,
	GRIBADE_CRATER_LAKE_220030000,
	MANIRS_DOCK_220030000,
	GUNMARSONS_CAMPSITE_220030000,
	BLACK_CLAW_VILLAGE_220030000,
	BASFELT_HUNTING_GROUND_220030000,
	BASFELT_VILLAGE_220030000,
	MOSLAN_FOREST_220030000,
	LEPHARIST_ENCAMPMENT_220030000,
	MUMU_VILLAGE_220030000,
	HEART_OF_IMPETUSIUM_220030000,
	ROAD_TO_MORHEIM_220030000,
	IMPETUSIUM_220030000,
	TRADERS_BERTH_220030000,
	ALTGARD_FORTRESS_DUNGEON_ENTRANCE_220030000,
	MOSLAN_RELICS_220030000,
	BLACK_CLAW_OUTPOST_220030000,
	MOSLAN_CROSSROAD_220030000,
	ZEMURRUS_GRAVE_220030000,
	MOSBEAR_HABITAT_220030000,
	ALTAR_OF_TIAMAT_220030000,
	KAIBECHS_CAMPSITE_220030000,
	CALDERON_HILL_220030000,
	KARLS_CAMPSITE_220030000,
	ALTGARD_EAST_GATE_220030000,
	SEGGURHEIM_220030000,
	ALTGARD_FORTRESS_220030000,

	//Morheim
	EXECUTION_GROUND_OF_DELTRAS_220020000,
	MIST_MANE_VILLAGE_220020000,
	SALINTUS_OBSERVATION_POST_220020000,
	ROAD_TO_BELUSLAN_220020000,
	AIRSHIP_CRASH_SITE_220020000,
	MIST_MANE_TRAINING_GROUND_220020000,
	CHAIKATAS_HIDEOUT_220020000,
	WONSHIKUTZS_LABORATORY_220020000,
	LAVA_CAVE_OF_TARAN_220020000,
	PATAMOR_THICKET_220020000,
	MT_MUSPHEL_220020000,
	SKY_TEMPLE_OF_ARKANIS_220020000,
	HALABANA_HOT_SPRINGS_220020000,
	MUNMUN_GINSENG_PLANTATION_220020000,
	ROAD_TO_ALTGARD_220020000,
	SKY_BRIDGE_VALLEY_220020000,
	HILL_OF_BELEMU_220020000,
	FIRE_TEMPLE_220020000,
	MORHEIM_OBSERVATORY_220020000,
	SILVER_MANE_VILLAGE_220020000,
	SPRIGG_HABITAT_220020000,
	SALINTUS_RISE_220020000,
	KLAW_HABITAT_220020000,
	ALSIG_VILLAGE_220020000,
	SKY_TEMPLE_ENTRANCE_220020000,
	SALINTUS_DESERT_220020000,
	NUNU_VILLAGE_220020000,
	MIST_MANE_VILLAGE_ENTRANCE_220020000,
	PATAMOR_RIDGE_PATH_220020000,
	KARHELS_AETHERIC_FIELD_220020000,
	KELLANS_CABIN_220020000,
	MT_MUSPHEL_ENTRANCE_220020000,
	ALSIG_BASIN_220020000,
	FORTRESS_OF_SORROW_220020000,
	MORHEIM_SNOW_FIELD_220020000,
	KASAKAS_WOOD_CAVE_220020000,
	GIANT_ROCK_WATERFALL_220020000,
	CRYSTAL_RISE_220020000,
	ALTAR_OF_THE_BLACK_DRAGON_220020000,
	ALTAR_OF_TRIAL_220020000,
	OCTANUS_LAIR_220020000,
	ALSIG_CROSSROAD_220020000,
	LEPHARIST_CITADEL_220020000,
	FALL_ROAD_220020000,
	KENTARI_VILLAGE_220020000,
	ICE_CLAW_VILLAGE_220020000,
	MORHEIM_ICE_FORTRESS_220020000,
	RED_LAVA_CLIFF_220020000,
	Q1466,
	Q2393,
	
	//Brusthonin
	HEIRNIRS_CABIN_220050000,
	BROHUNIR_220050000,
	BLACK_OPAL_SHIP_ANCHORAGE_220050000,
	DECOMPOSED_GREENS_220050000,
	NAHOR_LAKE_220050000,
	THE_EASTWEALD_220050000,
	BALTASAR_CEMETERY_220050000,
	OLD_NAHOR_CASTLE_220050000,
	GRIFFONS_CLAW_ENCAMPMENT_220050000,
	SETTLERS_CAMPSITE_220050000,
	IOLLU_HILLS_220050000,
	BALTASAR_HILL_VILLAGE_220050000,
	WAILING_CLIFFS_220050000,
	BUBU_VILLAGE_220050000,
	SUDORVILLE_220050000,
	BUBU_CHANS_HIDEOUT_220050000,
	HAVENJARK_FARM_220050000,
	HAVENJARK_CEMETERY_220050000,
	BRUSTHONIN_MITHRIL_MINE_220050000,
	PERPET_FALLS_220050000,
	IOLLU_FOREST_220050000,
	CAROBIAN_COAST_220050000,
	CANYON_SCOUT_POST_220050000,
	POLLUTED_WASTE_220050000,
	THE_NORTHWEALD_220050000,
	THE_GOLDEN_COAST_220050000,
	STRAGGLERS_SHELTER_220050000,
	THE_LEGEND_SHRINE_220050000,
	THE_COASTAL_PASS_220050000,
	THE_SAPLANDS_220050000,
	ADMA_STRONGHOLD_220050000,
	CAYRON_HILL_220050000,
	ADMA_PLAINS_220050000,
	SHAMANS_HOUSE_220050000,
	VIGRID_PLAINS_220050000;
}
