package net.horizonsend.ion.proxy

import kotlinx.serialization.Serializable

@Serializable
data class ProxyConfiguration(
	val discordBotToken: String = "",
	val motdFirstLine: String = "",
	val linkBypassRole: Long = 0,
	val discordServer: Long = 0,
	val globalChannel: Long = 0,
	val linkedRole: Long = 0,
	val roleMap: Map<String, Long> = mapOf(),
	val voteSites: List<VoteSite> = listOf()
) {
	@Serializable
	data class VoteSite(val serviceName: String, val displayName: String, val displayAddress: String)
}
