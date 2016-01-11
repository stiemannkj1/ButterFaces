/*
 * Copyright Lars Michaelis and Stephan Zerhusen 2016.
 * Distributed under the MIT License.
 * (See accompanying file README.md file or copy at http://opensource.org/licenses/MIT)
 */
package de.larmic.butterfaces.component.showcase.tree.examples.stargate;

import de.larmic.butterfaces.component.showcase.example.CssCodeExample;

/**
 * @author Lars Michaelis
 */
public class EpisodesCssExample extends CssCodeExample {

    public EpisodesCssExample() {
        this.addCss(".stargateEpisodeItem", "display: flex", "align-items: stretch");
        this.addCss(".stargateEpisodeItem img", "height: 75px");
        this.addCss(".stargateEpisodeItem h4", "font-size: 16px", "margin-top: 5px");
        this.addCss(".stargateEpisodeItem .stargateEpisodeDetails", "font-size: 12px", "margin-left: 5px");
        this.addCss(".stargateEpisodeItem .stargateEpisodeDetails > div", "display: flex", "align-items: baseline");
        this.addCss(".stargateEpisodeItem .stargateEpisodeDetails label", "width: 80px", "font-weight: bold");
        this.addCss(".stargateEpisodeItem .stargateEpisodeDetails span", "flex: 1");
    }
}
