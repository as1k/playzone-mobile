package ktorModule

import json.serializationModule
import ktor.ktorModule
import ktorModule.database.databaseModule
import org.kodein.di.DI

val coreModule = DI.Module("coreModule") {
    importAll(
        serializationModule,
        databaseModule,
        ktorModule
    )
}