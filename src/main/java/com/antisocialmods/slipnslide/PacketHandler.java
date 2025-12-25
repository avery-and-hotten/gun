package com.antisocialmods.slipnslide;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraft.util.ResourceLocation;

public abstract class PacketHandler implements IMessageHandler<SlipNMessage, IMessage> {
    private static final String PROTOCOL_VERSION = "1";

    public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.CHANNEL.newSimpleChannel(
        new ResourceLocation("slipnslide", "movement"),
        () -> PROTOCOL_VERSION
    );

    @Override
    public IMessage onMessage(SlipNMessage msg, )

    public void send() {

    }

    public void recv() {

    }
}
