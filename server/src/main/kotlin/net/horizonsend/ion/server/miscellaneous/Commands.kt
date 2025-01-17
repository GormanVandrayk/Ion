package net.horizonsend.ion.server.miscellaneous

import net.horizonsend.ion.server.IonCommand
import net.horizonsend.ion.server.configuration.ConfigurationCommands
import net.horizonsend.ion.server.features.achievements.AchievementsCommand
import net.horizonsend.ion.server.features.blasters.SettingsCommand
import net.horizonsend.ion.server.features.client.whereisit.SearchCommand
import net.horizonsend.ion.server.features.customitems.commands.ConvertCommand
import net.horizonsend.ion.server.features.customitems.commands.CustomItemCommand
import net.horizonsend.ion.server.miscellaneous.commands.CalcExpCommand
import net.horizonsend.ion.server.features.space.generation.SpaceGenCommand
import net.horizonsend.ion.server.miscellaneous.commands.CheckProtectionCommand
import net.horizonsend.ion.server.miscellaneous.commands.FixExtractorsCommand

val commands = arrayOf(
	SpaceGenCommand(),
	ConfigurationCommands(),
	ConvertCommand(),
	CustomItemCommand(),
	SettingsCommand(),
	IonCommand(),
	SearchCommand(),
	CalcExpCommand(),
	CheckProtectionCommand(),
	FixExtractorsCommand(),

	AchievementsCommand()
)
