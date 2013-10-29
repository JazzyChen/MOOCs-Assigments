using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Audio;
using Microsoft.Xna.Framework.Content;
using Microsoft.Xna.Framework.GamerServices;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;
using Microsoft.Xna.Framework.Media;

namespace GameProject
{
    /// <summary>
    /// This is the main type for your game
    /// </summary>
    public class Game1 : Microsoft.Xna.Framework.Game
    {
        GraphicsDeviceManager graphics;
        SpriteBatch spriteBatch;

        // game state
        GameState gameState = GameState.Menu;

        // Increment 1: opening screen fields

        const int WIDTH_RESOLUTION = 800;
        const int HEIGHT_RESOLUTION = 600;
        Texture2D openingScreenTexture;
        Rectangle openingScreenRec;

        // Increment 2: the board
        NumberBoard numberBoard;

        public Game1()
        {
            graphics = new GraphicsDeviceManager(this);
            Content.RootDirectory = "Content";

            // Increment 1: set window resolution

            graphics.PreferredBackBufferHeight = HEIGHT_RESOLUTION;
            graphics.PreferredBackBufferWidth = WIDTH_RESOLUTION;

            // Increment 1: make the mouse visible

            this.IsMouseVisible = true;
        }

        /// <summary>
        /// Allows the game to perform any initialization it needs to before starting to run.
        /// This is where it can query for any required services and load any non-graphic
        /// related content.  Calling base.Initialize will enumerate through any components
        /// and initialize them as well.
        /// </summary>
        protected override void Initialize()
        {
             base.Initialize();
        }

        /// <summary>
        /// LoadContent will be called once per game and is the place to load
        /// all of your content.
        /// </summary>
        protected override void LoadContent()
        {
            // Create a new SpriteBatch, which can be used to draw textures.
            spriteBatch = new SpriteBatch(GraphicsDevice);

            // load audio content

            // Increment 1: load opening screen and set opening screen draw rectangle

            openingScreenTexture = Content.Load<Texture2D>("openingscreen");
            openingScreenRec = new Rectangle(0, 0, 
                openingScreenTexture.Width, openingScreenTexture.Height);

            // Increment 2: create the board object (this will be moved before you're done with the project)
            numberBoard = new NumberBoard(Content, new Vector2(WIDTH_RESOLUTION/2, HEIGHT_RESOLUTION / 2), HEIGHT_RESOLUTION / 2, 8, null);
        }

        /// <summary>
        /// UnloadContent will be called once per game and is the place to unload
        /// all content.
        /// </summary>
        protected override void UnloadContent()
        {
            // TODO: Unload any non ContentManager content here
        }

        /// <summary>
        /// Allows the game to run logic such as updating the world,
        /// checking for collisions, gathering input, and playing audio.
        /// </summary>
        /// <param name="gameTime">Provides a snapshot of timing values.</param>
        protected override void Update(GameTime gameTime)
        {
            // Allows the game to exit
            if (GamePad.GetState(PlayerIndex.One).Buttons.Back == ButtonState.Pressed)
                this.Exit();

            // Increment 2: change game state if game state is GameState.Menu and user presses Enter

            if (gameState == GameState.Menu && Keyboard.GetState().IsKeyDown(Keys.Enter))
                gameState = GameState.Play;

            // if we're actually playing, update mouse state and update board

            base.Update(gameTime);
        }

        /// <summary>
        /// This is called when the game should draw itself.
        /// </summary>
        /// <param name="gameTime">Provides a snapshot of timing values.</param>
        protected override void Draw(GameTime gameTime)
        {
            GraphicsDevice.Clear(Color.White);

            // Increments 1 and 2: draw appropriate items here
            if (gameState == GameState.Menu)
            {
                spriteBatch.Begin();

                spriteBatch.Draw(openingScreenTexture, openingScreenRec, Color.Green);

                spriteBatch.End();
            }
            else
            {
                numberBoard.Draw(spriteBatch);
            }

            base.Draw(gameTime);
        }

        /// <summary>
        /// Starts a game
        /// </summary>
        void StartGame()
        {
            // randomly generate new number for game

            // create the board object (this will be moved before you're done)

        }
    }
}
