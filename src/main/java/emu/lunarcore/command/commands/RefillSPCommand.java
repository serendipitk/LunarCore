package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.game.player.lineup.PlayerLineup;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "energy", permission = "player.energy", requireTarget = true, desc = "/energy 补充当前阵容中所有角色的能量.")
public class RefillSPCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        PlayerLineup lineup = args.getTarget().getCurrentLineup();
        lineup.forEachAvatar(avatar -> {
            avatar.setCurrentSp(lineup, 10000);
            avatar.save();
        });
        lineup.refreshLineup();
        
        args.sendMessage("Amireux会重新填满你阵容中所有角色的能量 " + args.getTarget().getName());
    }

}
