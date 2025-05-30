package comportamentais

fun main() {
    val lightOnCommand = LightOnCommand(Light())
    val lightOffCommand = LightOffCommand(Light())
    val remoteControl = RemoteControl()
    remoteControl.addCommand(lightOnCommand)
    remoteControl.executeCommands()
    remoteControl.addCommand(lightOffCommand)
    remoteControl.executeCommands()
}

interface Command {
    fun action()
}

class Light{
    fun turnOn() {
        println("Light is turned on")
    }

    fun turnOff() {
        println("Light is turned off")
    }
}

class LightOnCommand(private val light: Light) : Command {
    override fun action() {
        light.turnOn()
    }
}

class LightOffCommand(private val light: Light) : Command {
    override fun action() {
        light.turnOff()
    }
}

class RemoteControl {
    private val commands = mutableListOf<Command>()

    fun addCommand(command: Command) {
        commands.add(command)
    }

    fun executeCommands() {
        for (command in commands) {
            command.action()
        }
        commands.clear()
    }
}
