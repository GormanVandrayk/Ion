package net.starlegacy.feature.starship.subsystem.weapon.primary

import net.horizonsend.ion.server.IonServer
import net.starlegacy.feature.starship.active.ActiveStarship
import net.starlegacy.feature.starship.subsystem.weapon.CannonWeaponSubsystem
import net.starlegacy.feature.starship.subsystem.weapon.projectile.PlasmaLaserProjectile
import net.starlegacy.util.Vec3i
import org.bukkit.Location
import org.bukkit.block.BlockFace
import org.bukkit.entity.Player
import org.bukkit.util.Vector

class PlasmaCannonWeaponSubsystem(starship: ActiveStarship, pos: Vec3i, face: BlockFace) :
	CannonWeaponSubsystem(starship, pos, face) {
	override val powerUsage: Int = IonServer.balancing.starshipWeapons.plasmaCannon.powerUsage
	override val length: Int = IonServer.balancing.starshipWeapons.plasmaCannon.length
	override val angleRadians: Double = Math.toRadians(IonServer.balancing.starshipWeapons.plasmaCannon.angleRadians)
	override val convergeDist: Double = IonServer.balancing.starshipWeapons.plasmaCannon.convergeDistance
	override val extraDistance: Int = IonServer.balancing.starshipWeapons.plasmaCannon.extraDistance

	override fun isAcceptableDirection(face: BlockFace): Boolean {
		return true
	}

	override fun isForwardOnly(): Boolean = IonServer.balancing.starshipWeapons.plasmaCannon.fowardOnly

	override fun getMaxPerShot(): Int {
		return 1
	}

	override fun fire(
		loc: Location,
		dir: Vector,
		shooter: Player,
		target: Vector?
	) {
		PlasmaLaserProjectile(starship, loc, dir, shooter).fire()
	}
}
