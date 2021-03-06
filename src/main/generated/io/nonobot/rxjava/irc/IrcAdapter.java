/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.nonobot.rxjava.irc;

import java.util.Map;
import io.vertx.lang.rxjava.InternalHelper;
import rx.Observable;
import io.nonobot.irc.IrcOptions;
import io.nonobot.rxjava.core.adapter.ConnectionRequest;
import io.nonobot.rxjava.core.adapter.BotAdapter;
import io.vertx.rxjava.core.Vertx;
import io.vertx.core.Handler;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.nonobot.irc.IrcAdapter original} non RX-ified interface using Vert.x codegen.
 */

public class IrcAdapter implements Handler<ConnectionRequest> {

  final io.nonobot.irc.IrcAdapter delegate;

  public IrcAdapter(io.nonobot.irc.IrcAdapter delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public void handle(ConnectionRequest arg0) { 
    this.delegate.handle((io.nonobot.core.adapter.ConnectionRequest) arg0.getDelegate());
  }

  public static BotAdapter create(Vertx vertx, IrcOptions options) { 
    BotAdapter ret= BotAdapter.newInstance(io.nonobot.irc.IrcAdapter.create((io.vertx.core.Vertx) vertx.getDelegate(), options));
    return ret;
  }


  public static IrcAdapter newInstance(io.nonobot.irc.IrcAdapter arg) {
    return arg != null ? new IrcAdapter(arg) : null;
  }
}
