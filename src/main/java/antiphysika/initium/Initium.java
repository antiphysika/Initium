/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.initium;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(Initium.MOD_ID)
public class Initium extends InitiumBase
{
  public static final String MOD_ID = "initium";
  static final Logger LOGGER = LogUtils.getLogger();

  public Initium (IEventBus bus, ModContainer container)
  {
  }

  public static Logger getLogger ()
  {
    return LOGGER;
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :